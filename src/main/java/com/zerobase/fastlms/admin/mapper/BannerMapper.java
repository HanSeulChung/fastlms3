package com.zerobase.fastlms.admin.mapper;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {
//    List<BannerDto> select(BannerDto parameter);
long selectListCount(BannerParam parameter);
List<BannerDto> selectList(BannerParam parameter);

List<BannerDto> selectList(BannerParam parameter, String orderByClause);

}
