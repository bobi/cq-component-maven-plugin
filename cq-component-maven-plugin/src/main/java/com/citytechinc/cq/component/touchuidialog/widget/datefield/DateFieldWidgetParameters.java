/**
 *    Copyright 2013 CITYTECH, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.citytechinc.cq.component.touchuidialog.widget.datefield;

import com.citytechinc.cq.component.touchuidialog.widget.TouchUIWidgetParameters;

public class DateFieldWidgetParameters extends TouchUIWidgetParameters {

    protected String minDate;
    protected String maxDate;
    protected String storedFormat; //default "YYYY-MM-DD[T]HH:mm:ss.000Z"
    protected String displayedFormat;

    public String getMinDate() {
        return minDate;
    }

    public void setMinDate(String minDate) {
        this.minDate = minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getStoredFormat() {
        return storedFormat;
    }

    public void setStoredFormat(String storedFormat) {
        this.storedFormat = storedFormat;
    }

    public String getDisplayedFormat() {
        return displayedFormat;
    }

    public void setDisplayedFormat(String displayedFormat) {
        this.displayedFormat = displayedFormat;
    }

}
