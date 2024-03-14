package com.entity.vo;

import com.entity.JisuanjizhuanyeruanjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 计算机专业相关的软件
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jisuanjizhuanyeruanjian")
public class JisuanjizhuanyeruanjianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 软件编号
     */

    @TableField(value = "jisuanjizhuanyeruanjian_uuid_number")
    private String jisuanjizhuanyeruanjianUuidNumber;


    /**
     * 软件名称
     */

    @TableField(value = "jisuanjizhuanyeruanjian_name")
    private String jisuanjizhuanyeruanjianName;


    /**
     * 软件照片
     */

    @TableField(value = "jisuanjizhuanyeruanjian_photo")
    private String jisuanjizhuanyeruanjianPhoto;


    /**
     * 安装教程
     */

    @TableField(value = "jisuanjizhuanyeruanjian_video")
    private String jisuanjizhuanyeruanjianVideo;


    /**
     * 安装包
     */

    @TableField(value = "jisuanjizhuanyeruanjian_file")
    private String jisuanjizhuanyeruanjianFile;


    /**
     * 软件类型
     */

    @TableField(value = "jisuanjizhuanyeruanjian_types")
    private Integer jisuanjizhuanyeruanjianTypes;


    /**
     * 软件介绍
     */

    @TableField(value = "jisuanjizhuanyeruanjian_content")
    private String jisuanjizhuanyeruanjianContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "jisuanjizhuanyeruanjian_delete")
    private Integer jisuanjizhuanyeruanjianDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：软件编号
	 */
    public String getJisuanjizhuanyeruanjianUuidNumber() {
        return jisuanjizhuanyeruanjianUuidNumber;
    }


    /**
	 * 获取：软件编号
	 */

    public void setJisuanjizhuanyeruanjianUuidNumber(String jisuanjizhuanyeruanjianUuidNumber) {
        this.jisuanjizhuanyeruanjianUuidNumber = jisuanjizhuanyeruanjianUuidNumber;
    }
    /**
	 * 设置：软件名称
	 */
    public String getJisuanjizhuanyeruanjianName() {
        return jisuanjizhuanyeruanjianName;
    }


    /**
	 * 获取：软件名称
	 */

    public void setJisuanjizhuanyeruanjianName(String jisuanjizhuanyeruanjianName) {
        this.jisuanjizhuanyeruanjianName = jisuanjizhuanyeruanjianName;
    }
    /**
	 * 设置：软件照片
	 */
    public String getJisuanjizhuanyeruanjianPhoto() {
        return jisuanjizhuanyeruanjianPhoto;
    }


    /**
	 * 获取：软件照片
	 */

    public void setJisuanjizhuanyeruanjianPhoto(String jisuanjizhuanyeruanjianPhoto) {
        this.jisuanjizhuanyeruanjianPhoto = jisuanjizhuanyeruanjianPhoto;
    }
    /**
	 * 设置：安装教程
	 */
    public String getJisuanjizhuanyeruanjianVideo() {
        return jisuanjizhuanyeruanjianVideo;
    }


    /**
	 * 获取：安装教程
	 */

    public void setJisuanjizhuanyeruanjianVideo(String jisuanjizhuanyeruanjianVideo) {
        this.jisuanjizhuanyeruanjianVideo = jisuanjizhuanyeruanjianVideo;
    }
    /**
	 * 设置：安装包
	 */
    public String getJisuanjizhuanyeruanjianFile() {
        return jisuanjizhuanyeruanjianFile;
    }


    /**
	 * 获取：安装包
	 */

    public void setJisuanjizhuanyeruanjianFile(String jisuanjizhuanyeruanjianFile) {
        this.jisuanjizhuanyeruanjianFile = jisuanjizhuanyeruanjianFile;
    }
    /**
	 * 设置：软件类型
	 */
    public Integer getJisuanjizhuanyeruanjianTypes() {
        return jisuanjizhuanyeruanjianTypes;
    }


    /**
	 * 获取：软件类型
	 */

    public void setJisuanjizhuanyeruanjianTypes(Integer jisuanjizhuanyeruanjianTypes) {
        this.jisuanjizhuanyeruanjianTypes = jisuanjizhuanyeruanjianTypes;
    }
    /**
	 * 设置：软件介绍
	 */
    public String getJisuanjizhuanyeruanjianContent() {
        return jisuanjizhuanyeruanjianContent;
    }


    /**
	 * 获取：软件介绍
	 */

    public void setJisuanjizhuanyeruanjianContent(String jisuanjizhuanyeruanjianContent) {
        this.jisuanjizhuanyeruanjianContent = jisuanjizhuanyeruanjianContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJisuanjizhuanyeruanjianDelete() {
        return jisuanjizhuanyeruanjianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJisuanjizhuanyeruanjianDelete(Integer jisuanjizhuanyeruanjianDelete) {
        this.jisuanjizhuanyeruanjianDelete = jisuanjizhuanyeruanjianDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
