/*
 * The MIT License
 *
 * Copyright 2017 mgamble.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ca.mgamble.obihai.api.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class Configurations {
    private List<Configuration> data;

    
    public void addConfiguration(Configuration config) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(config);
    }
    /**
     * @return the data
     */
    public List<Configuration> getConfigurations() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setConfigurations(List<Configuration> data) {
        this.data = data;
    }
    
}
