package com.onlineexam.util.restful;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class JsonPage<T> implements Serializable {

    // 当前类在实际开发中替代Page/PageInfo这样的由框架提供的分页信息类
    // 这样当前微服务项目所有分页业务都可以使用这个类型,实现通用
    // 属性的个数原则是满足前端需要即可,这里列出最基本的分页信息属性
    @ApiModelProperty(value = "总页数",name = "totalPages")
    private Integer totalPages;
    @ApiModelProperty(value = "总条数",name = "totalCount")
    private Long totalCount;
    @ApiModelProperty(value = "页码",name = "page")
    private Integer page;
    @ApiModelProperty(value = "每页条数",name = "pageSize")
    private Integer pageSize;

    // JsonPage对象要能够报错分页数据
    @ApiModelProperty(value = "分页数据",name = "list")
    private List<T> list;



    // 下面编写一个方法,能够实现将PageInfo类型对象转换为JsonPage对象返回
    public static <T> JsonPage<T> restPage(PageInfo<T> pageInfo){
        // 将参数pageInfo对象相同意义的属性赋值到JsonPage对象中,来完成转换
        JsonPage<T> jsonPage=new JsonPage<>();
        jsonPage.setTotalPages(pageInfo.getPages());
        jsonPage.setTotalCount(pageInfo.getTotal());
        jsonPage.setPage(pageInfo.getPageNum());
        jsonPage.setPageSize(pageInfo.getPageSize());
        // 分页数据也要赋值过来
        jsonPage.setList(pageInfo.getList());
        // 最后返回转换完成的对象
        return jsonPage;
    }

}
