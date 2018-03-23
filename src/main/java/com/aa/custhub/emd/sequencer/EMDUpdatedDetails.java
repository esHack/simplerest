package com.aa.custhub.emd.sequencer;

import com.aa.custhub.cache.record.ICacheValue;
import com.aa.custhub.cache.record.ICacheVersionValue;

public class EMDUpdatedDetails implements ICacheVersionValue {

    ICacheValue airlineDocBean;

    long version;
    
    public EMDUpdatedDetails() {
        super();
    }
    
    @Override
    public ICacheValue getCacheValue() {
        return airlineDocBean;
    }

    @Override
    public long getVersion() {
        return version;
    }

    @Override
    public void setCacheValue(ICacheValue value) {
        airlineDocBean = value;
    }

    @Override
    public void setVersion(long arg0) {
        version = arg0;
    }
}