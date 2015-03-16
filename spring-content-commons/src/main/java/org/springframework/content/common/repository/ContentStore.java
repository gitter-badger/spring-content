package org.springframework.content.common.repository;

import java.io.InputStream;
import java.io.Serializable;

public interface ContentStore<S, SID extends Serializable> extends ContentRepository<S, SID> {
	
	void setContent(S property, InputStream content);
	InputStream getContent(S property);

}
