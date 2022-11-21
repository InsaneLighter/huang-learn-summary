package com.huang;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.LineHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * @Time 2022-10-31 15:41
 * Created by Huang
 * className: FileDemo
 * Description:
 */
@Slf4j
public class FileDemo {
    String fileName = "H:\\personal\\project\\huang-learn-summary\\file\\src\\main\\resources\\FileDemo.txt";
    String moveFileName = "H:\\personal\\project\\huang-learn-summary\\file\\src\\main\\resources\\FileDemo.txt.bak";
    String copyFileName = "H:\\personal\\project\\huang-learn-summary\\file\\src\\main\\resources\\FileCopyDemo.txt";
    String copyDestFileName = "H:\\personal\\project\\huang-learn-summary\\file\\src\\main\\resources\\FileCopyDestDemo.txt";
    String touchFileName = "H:\\personal\\project\\huang-learn-summary\\file\\src\\main\\resources\\touch\\file\\touch.txt";

    @Test
    public void listFiles(){
        String fileName = "H:\\personal\\张蝶";
        File file = new File(fileName);
        FileUtil.loopFiles(file).stream().map(File::getName).forEach(item->log.info("fileName: {}",item));
    }

    @Test
    public void move(){
        FileUtil.move(new File(fileName), new File(moveFileName), true);
        // after move path H:\personal\project\huang-learn-summary\file\FileDemo.txt.bak
    }

    @Test
    public void copy01(){
        FileUtil.copy(new File(copyFileName), new File(copyDestFileName), true);
        // after move path H:\personal\project\huang-learn-summary\file\FileDemo.txt.bak
    }

    @Test
    public void readUtf8String(){
        String content = FileUtil.readUtf8String(copyFileName);
        log.info("content:{}",content);
    }

    @Test
    public void readLines(){
        List<String> list = FileUtil.readUtf8Lines(copyFileName);
        log.info("list:{}",list);
        log.info("size:{}",list.size());
    }

    @Test
    public void read(){
        FileUtil.readUtf8Lines(new File(copyFileName), (LineHandler) line -> {
            log.info("line:{}",line);
        });
    }

    @Test
    public void touch(){
        //父目录不存在则创建父目录
        File touch = FileUtil.touch(touchFileName);
        String content = FileUtil.readUtf8String(touch);
        log.info("content:{}",content);
    }
}
