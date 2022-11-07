package com.huang;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @Time 2022-11-04 11:38
 * Created by Huang
 * className: MapFileZipUtil
 * Description:
 */
public class MapFileZipUtil {
    /**
     * 压缩成ZIP 方法1
     *
     * @param srcDir           压缩文件夹路径
     * @param targetFile       压缩目标文件
     * @param KeepDirStructure 是否保留原来的目录结构,true:保留目录结构; false:所有文件跑到压缩包根目录下(注意：不保留目录结构可能会出现同名文件,会压缩失败)
     * @throws RuntimeException 压缩失败会抛出运行时异常
     */
    public static void zipFolder(String srcDir, String targetFile, boolean KeepDirStructure) {
        long startTime = System.currentTimeMillis();
        try {
            OutputStream out = new FileOutputStream(targetFile);
            ZipOutputStream zos = new ZipOutputStream(out);
            final File sourceDir = new File(srcDir);
            compressFolder(sourceDir, zos, sourceDir.getName(), KeepDirStructure);
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 递归压缩方法
     *
     * @param sourceDir        源文件
     * @param zipOut           zip输出流
     * @param name             压缩后的名称
     * @param keepDirStructure 是否保留原来的目录结构,true:保留目录结构; false:所有文件跑到压缩包根目录下(注意：不保留目录结构可能会出现同名文件,会压缩失败)
     * @throws Exception
     */
    private static void compressFolder(File sourceDir, ZipOutputStream zipOut, String name, boolean keepDirStructure) throws Exception {
        //如果是文件
        if (sourceDir.isFile()) {
            //WritableByteChannel
            WritableByteChannel writableByteChannel = Channels.newChannel(zipOut);
            // 向zip输出流中添加一个zip实体，构造器中name为zip实体的文件的名字
            zipOut.putNextEntry(new ZipEntry(name));
            // copy文件到zip输出流中
            //MappedByteBuffer
            //内存中的映射文件
            MappedByteBuffer mappedByteBuffer = new RandomAccessFile(sourceDir, "r").getChannel()
                    .map(FileChannel.MapMode.READ_ONLY, 0, sourceDir.length());
            writableByteChannel.write(mappedByteBuffer);
            // Complete the entry
            zipOut.closeEntry();
        } else {//如果是文件夹
            File[] listFiles = sourceDir.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                // 需要保留原来的文件结构时,需要对空文件夹进行处理
                if (keepDirStructure) {
                    // 空文件夹的处理
                    zipOut.putNextEntry(new ZipEntry(name + "/"));
                    // 没有文件，不需要文件的copy
                    zipOut.closeEntry();
                }
            } else {
                for (File file : listFiles) {
                    // 判断是否需要保留原来的文件结构
                    if (keepDirStructure){
                        // 注意：file.getName()前面需要带上父文件夹的名字加一斜杠,
                        // 不然最后压缩包中就不能保留原来的文件结构,即：所有文件都跑到压缩包根目录下了
                        compressFolder(file, zipOut, name + "/" + file.getName(), true);
                    } else {
                        compressFolder(file, zipOut, file.getName(), false);
                    }
                }
            }
        }
    }

    public static void main(final String[] args) {
        zipFolder("H:\\personal\\project\\huang-learn-summary\\zip\\folder", "H:\\personal\\project\\huang-learn-summary\\zip\\folder_map.zip", true);
        //1G 耗时：37570ms
    }
}
