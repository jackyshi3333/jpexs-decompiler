/*
 *  Copyright (C) 2010-2015 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.tags.base;

import com.jpexs.decompiler.flash.timeline.DepthState;
import com.jpexs.helpers.SerializableImage;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JPEXS
 */
public class RenderContext {

    public DepthState stateUnderCursor;

    public int mouseButton;

    public Map<String, SerializableImage> shapeCache = new HashMap<>();
}