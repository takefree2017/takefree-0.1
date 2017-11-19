package com.takefree.dto.mapper;

import com.takefree.dto.model.ShareDTO;
import com.takefree.dto.query.ShareDTOQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoxiang on 2017/11/7.
 */
@Repository
@Mapper
public interface ShareDTOMapper {
    public ShareDTO selectShareInfoById(Long id);

    public ShareDTO selectShareDetailById(Long id);

    public List<ShareDTO> selectShareInfoListByExample(ShareDTOQuery shareDTOQuery);

    public List<ShareDTO> selectLikeShareInfoListByExample(ShareDTOQuery shareDTOQuery);

    public List<ShareDTO> selectApplyShareInfoListByExample(ShareDTOQuery shareDTOQuery);

    public List<ShareDTO> selectReceivedShareInfoListByExample(ShareDTOQuery shareDTOQuery);
}
