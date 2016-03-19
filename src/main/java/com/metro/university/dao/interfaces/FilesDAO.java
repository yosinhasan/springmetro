package com.metro.university.dao.interfaces;


import com.metro.university.entity.FilesEntity;

import java.util.List;

public interface FilesDAO {
    /**
     * Get files.
     *
     * @return List<FilesEntity>
     */
    List<FilesEntity> getFiles();

    /**
     * Get file.
     *
     * @param fileName file name
     * @return FilesEntity
     */
    FilesEntity getFile(String fileName);

    /**
     * Get file.
     *
     * @param id id
     * @return FilesEntity
     */
    FilesEntity getFile(Integer id);

    /**
     * Get field value.
     *
     * @param id        id
     * @param fieldName field name
     * @return Object
     */
    Object getFieldValue(Long id, String fieldName);

}
