package oit.is.syumai.churenpoutou.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ChamberMapper {

  @Select("SELECT id,user,number from chamber where id = #{id}")
  Chamber selectById(int id);

}
