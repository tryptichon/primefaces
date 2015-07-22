/*
 * Copyright 2015 duke.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.event;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author duke
 */
public class MetaKeyEvent extends AjaxBehaviorEvent {

    private Boolean altKey;
    private Boolean metaKey;
    private Boolean shiftKey;

    public MetaKeyEvent(UIComponent component, Behavior behavior, String keys) {
        super(component, behavior);
        if (keys == null || keys.isEmpty()) {
            this.altKey = this.metaKey = this.shiftKey = false;
        } else {
            this.altKey = keys.contains("Alt");
            this.metaKey = keys.contains("Meta");
            this.shiftKey = keys.contains("Shift");
        }
    }

    public Boolean getAltKey() {
        return altKey;
    }

    public Boolean getMetaKey() {
        return metaKey;
    }

    public Boolean getShiftKey() {
        return shiftKey;
    }

}
