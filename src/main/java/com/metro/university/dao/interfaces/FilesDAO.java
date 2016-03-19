package com.metro.university.dao.interfaces;


import com.metro.university.entity.FilesEntity;

import java.util.List;


public interface FilesDAO {

    List<FilesEntity> getFiles();
    List<FilesEntity> getFiles(String fileName);
    Object getFieldValue(Long id, String fieldName);

}
