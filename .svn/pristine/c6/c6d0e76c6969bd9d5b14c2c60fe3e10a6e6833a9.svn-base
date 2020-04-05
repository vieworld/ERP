package com.warehouse.common;

import org.apache.commons.io.FilenameUtils;
import org.aspectj.util.FileUtil;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUploadUtils<T> {
    private static final String URL = "C://upload";

    public static List<String> fileUpload(MultipartFile[] files) throws IOException {
        List<String> path = new ArrayList<>();

        for (MultipartFile file : files) {
            if (!file.isEmpty()) {
                String fileName = FilenameUtils.getName(file.getName());
                File fileIO = new File(URL + "/" + fileName);

                file.transferTo(fileIO);

                path.add(fileName);
            }
        }

        return path;
    }
}
