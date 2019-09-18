package com.demo.dubbo.dubbobootapi.pojo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 贷款渠道商信息表
 * </p>
 *
 * @author 车资道科技
 * @since 2019-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LoansCanal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long sid;

    private Long tenantId;

    private String loansCanalCode;

    private String loansCanalName;

    private Integer state;

    private String canalPicture;

    private String canalPhone;

    private String canalRemarks;

    private String isElectronicContract;

    private String deleteFlag;

    private String newCarOptional;

    private String secondCarOptional;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String gpsSwitchStatus;

    private String reminder;

    private Long intoFileId;

    private Long contractFileId;

    private Long requestFileId;

    private String requirements;

    private Integer priority;

    private String contractFileUrl;

    private Integer isHaveCommission;

    private Integer isAfterInstallGps;

    private Integer isBankPlan;

}
