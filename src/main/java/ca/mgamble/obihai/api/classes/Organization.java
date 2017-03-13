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

/**
 *
 * @author mgamble
 */
public class Organization {
    private String id;
    private String displayName;
    private String parentOrg;
    private String defaultBaseProfile;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the parentOrg
     */
    public String getParentOrg() {
        return parentOrg;
    }

    /**
     * @param parentOrg the parentOrg to set
     */
    public void setParentOrg(String parentOrg) {
        this.parentOrg = parentOrg;
    }

    /**
     * @return the defaultBaseProfile
     */
    public String getDefaultBaseProfile() {
        return defaultBaseProfile;
    }

    /**
     * @param defaultBaseProfile the defaultBaseProfile to set
     */
    public void setDefaultBaseProfile(String defaultBaseProfile) {
        this.defaultBaseProfile = defaultBaseProfile;
    }
}
