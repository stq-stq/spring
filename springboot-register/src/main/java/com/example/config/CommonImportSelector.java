package com.example.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CommonImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //读取配置文件的内容common.imports
        List<String >imports=new ArrayList<String>();
        InputStream is = CommonImportSelector.class.getClassLoader().getResourceAsStream("common.imports");//读取并输出
        BufferedReader br=new BufferedReader(new InputStreamReader(is));//封装输出流
        String line = null;
        try {//有未处理的异常则捕获一下
            while ((line =br.readLine()) != null) {//当文件中有东西就加到list中
                imports.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    br.close();//释放一下
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return imports.toArray(new String[0]);//返回list，以字符串形式返回
    }
}
