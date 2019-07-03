package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@TableName("tb_item")
@Data
@Accessors(chain = true)
public class Item extends BasePOJO{
	
	@TableId(type = IdType.AUTO)
	private Long id;
	private String title;
	private String sellPoint;  //卖点信息
	private Long price;
	private Integer num;  //商品数量
	private String barcode;		//二维码
	private String image;  //图片信息
	private Long cid ; //商品的分类信息
	private Integer status;   //商品状态  1正常 2 下降 3 删除
	
	

}
