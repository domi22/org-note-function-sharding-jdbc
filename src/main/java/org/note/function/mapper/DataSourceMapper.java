package org.note.function.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataSourceMapper {


    List<String> getUser();

    List<String> getUser2();

    void add(@Param("name")String name,
             @Param("age")Integer age,
             @Param("addr")String addr);


    void addCast(@Param("name")String name,
             @Param("type")String age,
             @Param("value")String addr);


}
