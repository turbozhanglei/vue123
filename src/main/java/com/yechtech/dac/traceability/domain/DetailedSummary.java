package com.yechtech.dac.traceability.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 明细汇总
 * @author : 
 * @email : 
 * @since : 2020-11-16 06:46:09
 * @version : v1.0.0
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@TableName("cdm_fact_iqa_batch_traceability_detailed_summary")
public class DetailedSummary extends Model<DetailedSummary> implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "上游原料Id")
    private Long id;
    @ApiModelProperty(notes = "供应商JDE编码")
    private String supplierJdecode;
    @ApiModelProperty(notes = "供应商名称")
    private String supplierName;
    @ApiModelProperty(notes = "品项EQA编码")
    private String skuEqacode;
    @ApiModelProperty(notes = "品项JDE编码")
    private String skuJdecode;
    @ApiModelProperty(notes = "品项名称")
    private String skuName;
    @ApiModelProperty(notes = "生产日期")
    private Date productionDate;
    @ApiModelProperty(notes = "到货数量")
    private Integer productionQty;
    @ApiModelProperty(notes = "采购单位")
    private String uom;
    @ApiModelProperty(notes = "供应商发货数量")
    private Integer supplierShipmentQty;
    @ApiModelProperty(notes = "整合中心个数")
    private Integer ccNum;
    @ApiModelProperty(notes = "整合中心到货数量")
    private Integer ccReceivedQty;
    @ApiModelProperty(notes = "整合中心库存数量")
    private Integer ccInventoriesQty;
    @ApiModelProperty(notes = "物流中心个数")
    private Integer lcNum;
    @ApiModelProperty(notes = "物流中心到货数量")
    private Integer lcReceivedQty;
    @ApiModelProperty(notes = "物流中心库存数量")
    private Integer lcInventoriesQty;
    @ApiModelProperty(notes = "FQA市场个数")
    private Integer fqaNum;
    @ApiModelProperty(notes = "餐厅个数")
    private Integer storNum;
    @ApiModelProperty(notes = "追溯率")
    private BigDecimal traceRatio;

    
}