/*
 *  Licensed to GraphHopper GmbH under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for
 *  additional information regarding copyright ownership.
 *
 *  GraphHopper GmbH licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except in
 *  compliance with the License. You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.graphhopper.config;

import java.util.Objects;

import static com.graphhopper.config.ProfileConfig.validateProfileName;

public class CHProfileConfig {
    private String profile = "unset_ch_profile";

    private CHProfileConfig() {
        // default constructor needed for jackson
    }

    public CHProfileConfig(String profile) {
        setProfile(profile);
    }

    public String getProfile() {
        return profile;
    }

    public CHProfileConfig setProfile(String profile) {
        validateProfileName(profile);
        this.profile = profile;
        return this;
    }

    @Override
    public String toString() {
        return profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CHProfileConfig that = (CHProfileConfig) o;
        return Objects.equals(profile, that.profile);
    }

    @Override
    public int hashCode() {
        return profile.hashCode();
    }
}
