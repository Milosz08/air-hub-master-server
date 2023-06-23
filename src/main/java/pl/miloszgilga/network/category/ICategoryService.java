/*
 * Copyright (c) 2023 by MILOSZ GILGA <http://miloszgilga.pl>
 *
 * File name: ICategoryService.java
 * Last modified: 6/14/23, 12:12 AM
 * Project name: air-hub-master-server
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     <http://www.apache.org/license/LICENSE-2.0>
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the license.
 */

package pl.miloszgilga.network.category;

import java.util.List;

import pl.miloszgilga.network.category.resdto.CategoryResDto;
import pl.miloszgilga.network.category.resdto.CategoryWithTypeResDto;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public interface ICategoryService {
    List<CategoryWithTypeResDto> categories();
    List<CategoryResDto> categories(String type);
}