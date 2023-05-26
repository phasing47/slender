package com.sp.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sp.entity.ConfigRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;


}
