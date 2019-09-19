/*
 * Tencent is pleased to support the open source community by making QMUI_Android available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the MIT License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qmuiteam.qmui.skin.handler;

import android.view.View;

import com.qmuiteam.qmui.layout.IQMUILayout;

public class QMUISkinRuleSeparatorHandler extends QMUISkinRuleColorHandler {

    @Override
    void handle(View view, int color, String extra) {
        if (view instanceof IQMUILayout) {
            if ("top".equals(extra)) {
                ((IQMUILayout) view).updateTopSeparatorColor(color);
            } else if ("bottom".equals(extra)) {
                ((IQMUILayout) view).updateBottomSeparatorColor(color);
            } else if ("left".equals(extra)) {
                ((IQMUILayout) view).updateLeftSeparatorColor(color);
            } else if ("right".equals(extra)) {
                ((IQMUILayout) view).updateRightSeparatorColor(color);
            }
        }
    }
}