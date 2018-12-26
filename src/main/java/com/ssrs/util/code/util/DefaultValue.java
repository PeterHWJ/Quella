package com.ssrs.util.code.util;

import com.ssrs.util.code.domain.Basic;
import com.ssrs.util.code.domain.Field;
import com.ssrs.util.code.enums.FieldQuery;
import com.ssrs.util.code.enums.FieldType;
import com.ssrs.util.code.enums.FieldVerify;
import com.ssrs.util.commom.ToolUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 小懒虫
 * @date 2018/10/21
 */
public class DefaultValue {

    // 字符编码
    public static final String encode = "UTF-8";
    // maven源码目录
    public static final String mavenSourcePath = "src/main/";

    /**
     * 基本信息
     */
    public static Basic getBasic(){
        Basic basic = new Basic();
        basic.setProjectPath(ToolUtil.getProjectPath());
        basic.setPackagePath("com.ssrs");
        basic.setAuthor("上善若水");
        basic.setGenModule("order");
        basic.setTablePrefix("ssrs_");
        return basic;
    }

    /**
     * 字段列表
     */
    public static List<Field> fieldList(){
        List<Field> fields = new ArrayList<>();
        fields.add(new Field("id", "主键ID", FieldType.Long.getCode(), 0, true,null));
        fields.add(new Field("title", "标题", FieldType.String.getCode(), FieldQuery.Like.getCode(),true, Arrays.asList(new Integer[]{FieldVerify.NoNull.getCode()})));
        fields.add(new Field("remark", "备注", FieldType.String.getCode(), 0, false,null));
        fields.add(new Field("createDate", "创建时间", FieldType.Date.getCode(), 0, true,null));
        fields.add(new Field("updateDate", "更新时间", FieldType.Date.getCode(), 0, true,null));
        fields.add(new Field("createBy", "创建者", FieldType.Long.getCode(), 0, false,null));
        fields.add(new Field("updateBy", "更新者", FieldType.Long.getCode(), 0, false,null));
        fields.add(new Field("status", "数据状态", FieldType.Byte.getCode(), 0, true,null));
        return fields;
    }
}
