package app.base.dao.mapper;

import app.base.pojo.po.Usergys;
import app.base.pojo.po.UsergysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergysMapper {
    int countByExample(UsergysExample example);

    int deleteByExample(UsergysExample example);

    int deleteByPrimaryKey(String id);

    int insert(Usergys record);

    int insertSelective(Usergys record);

    List<Usergys> selectByExampleWithBLOBs(UsergysExample example);

    List<Usergys> selectByExample(UsergysExample example);

    Usergys selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByExampleWithBLOBs(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByExample(@Param("record") Usergys record, @Param("example") UsergysExample example);

    int updateByPrimaryKeySelective(Usergys record);

    int updateByPrimaryKeyWithBLOBs(Usergys record);

    int updateByPrimaryKey(Usergys record);
}