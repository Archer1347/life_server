package com.whoiszxl.zero.entity.dto;

import com.whoiszxl.zero.bean.AbstractObject;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ums_member_address
 * @author 
 */
@Data
public class MemberAddressDTO extends AbstractObject implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long memberId;

    /**
     * 收货人
     */
    private String reciverName;

    /**
     * 收货人电话号码
     */
    private String reciverPhone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 收货地址
     */
    private String detailAddress;

    /**
     * 是否默认 1:默认 2:非默认
     */
    private Boolean isDefault;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;
}