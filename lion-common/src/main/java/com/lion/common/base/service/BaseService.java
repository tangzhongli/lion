/**
 *   Copyright 2019 Yanzheng (https://github.com/micyo202). All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.lion.common.base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * IBaseService
 * 通用 service 接口，主要封装 Mybatis 分页方法
 *
 * @author Yanzheng (https://github.com/micyo202)
 * @date 2020/2/12
 */
public interface BaseService<T> extends IService<T> {

    PageInfo<T> page(int pageNum, int pageSize);

    PageInfo<T> page(int pageNum, int pageSize, String orderBy);

    PageInfo<T> page(Wrapper<T> queryWrapper, int pageNum, int pageSize);

    PageInfo<T> page(Wrapper<T> queryWrapper, int pageNum, int pageSize, String orderBy);

    PageInfo page(String statement, int pageNum, int pageSize);

    PageInfo page(String statement, int pageNum, int pageSize, String orderBy);

    PageInfo page(String statement, Object parameter, int pageNum, int pageSize);

    PageInfo page(String statement, Object parameter, int pageNum, int pageSize, String orderBy);

    T getByStatement(String statement);

    T getByStatement(String statement, Object parameter);

    List<T> listByStatement(String statement);

    List<T> listByStatement(String statement, Object parameter);

    int saveByStatement(String statement);

    int saveByStatement(String statement, Object parameter);

    int updateByStatement(String statement);

    int updateByStatement(String statement, Object parameter);
}