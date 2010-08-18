/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2010 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package org.glassfish.web.ha.authenticator;

import java.io.*;
import java.util.List;

/**
 * @author Shing Wai Chan
 */
public class HASingleSignOnEntryMetadata implements Serializable {
    protected String id = null;

    protected String authType = null;

    protected char[] password = null;

    protected byte[] principalBytes = null;

    protected List<HASessionData> sessionDataList = null;

    protected String username = null;

    protected String realmName = null;

    protected long lastAccessTime;

    protected long maxIdleTime;

    protected long version;

    // default constructor is required by backing store
    public HASingleSignOnEntryMetadata() {
    }

    public HASingleSignOnEntryMetadata(String id, byte[] principalBytes, String authType,
            String username, char[] password, String realmName,
            List<HASessionData> sessionDataList,
            long lastAccessTime, long maxIdleTime, long version) {
        
        this.id = id;
        this.principalBytes = ((principalBytes != null) ? ((byte[])principalBytes.clone()) : null);
        this.authType = authType;
        this.username = username;
        this.password = ((password != null) ? ((char[])password.clone()) : null);
        this.realmName = realmName;
        this.sessionDataList = sessionDataList;
        this.lastAccessTime = lastAccessTime;
        this.maxIdleTime = maxIdleTime;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public byte[] getPrincipalBytes() {
        return principalBytes;
    }

    public String getAuthType() {
        return authType;
    }

    public String getUsername() {
        return username;
    }

    public char[] getPassword() {
        return ((password != null) ? ((char[])password.clone()) : null);
    }

    public String getRealmName() {
        return realmName;
    }

    public List<HASessionData> getHASessionDataList() {
        return sessionDataList;
    }

    public long getLastAccessTime() {
        return lastAccessTime;
    }

    public long getVersion() {
        return version;
    }

    public long getMaxIdleTime() {
        return maxIdleTime;
    }
}
