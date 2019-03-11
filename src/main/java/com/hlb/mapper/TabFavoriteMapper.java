package com.hlb.mapper;

import com.hlb.pojo.TabFavorite;
import com.hlb.pojo.TabFavoriteExample;
import com.hlb.pojo.TabFavoriteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabFavoriteMapper {
    long countByExample(TabFavoriteExample example);

    int deleteByExample(TabFavoriteExample example);

    int deleteByPrimaryKey(TabFavoriteKey key);

    int insert(TabFavorite record);

    int insertSelective(TabFavorite record);

    List<TabFavorite> selectByExample(TabFavoriteExample example);

    TabFavorite selectByPrimaryKey(TabFavoriteKey key);

    int updateByExampleSelective(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByExample(@Param("record") TabFavorite record, @Param("example") TabFavoriteExample example);

    int updateByPrimaryKeySelective(TabFavorite record);

    int updateByPrimaryKey(TabFavorite record);
}