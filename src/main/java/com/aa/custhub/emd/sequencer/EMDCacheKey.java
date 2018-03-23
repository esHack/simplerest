package com.aa.custhub.emd.sequencer;

import com.aa.custhub.cache.record.ICacheKey;

import java.io.Serializable;

public class EMDCacheKey implements ICacheKey, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 9096916115965465764L;
  
    private String emdUniqueIdentifier;

    public EMDCacheKey(String emdUniqueIdentifier) {
        super();
        this.emdUniqueIdentifier = emdUniqueIdentifier;
    }

    public String getEmdUniqueIdentifier() {
        return emdUniqueIdentifier;
    }

    public void setEmdUniqueIdentifier(String emdUniqueIdentifier) {
        this.emdUniqueIdentifier = emdUniqueIdentifier;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emdUniqueIdentifier == null) ? 0 : emdUniqueIdentifier.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EMDCacheKey other = (EMDCacheKey) obj;
        if (emdUniqueIdentifier == null) {
            if (other.emdUniqueIdentifier != null)
                return false;
        } else if (!emdUniqueIdentifier.equals(other.emdUniqueIdentifier))
            return false;
        return true;
    }
    
    
}