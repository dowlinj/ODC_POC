/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.doc.guestbook.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Entry service. Represents a row in the &quot;Entry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.doc.guestbook.model.impl.EntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.doc.guestbook.model.impl.EntryImpl}.
 * </p>
 *
 * @author JY
 * @see Entry
 * @see com.liferay.doc.guestbook.model.impl.EntryImpl
 * @see com.liferay.doc.guestbook.model.impl.EntryModelImpl
 * @generated
 */
public interface EntryModel extends BaseModel<Entry>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a entry model instance should use the {@link Entry} interface instead.
	 */

	/**
	 * Returns the primary key of this entry.
	 *
	 * @return the primary key of this entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this entry.
	 *
	 * @param primaryKey the primary key of this entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this entry.
	 *
	 * @return the uuid of this entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this entry.
	 *
	 * @param uuid the uuid of this entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this entry.
	 *
	 * @return the entry ID of this entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this entry.
	 *
	 * @param entryId the entry ID of this entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the group ID of this entry.
	 *
	 * @return the group ID of this entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this entry.
	 *
	 * @param groupId the group ID of this entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this entry.
	 *
	 * @return the company ID of this entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this entry.
	 *
	 * @param companyId the company ID of this entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this entry.
	 *
	 * @return the user ID of this entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this entry.
	 *
	 * @param userId the user ID of this entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this entry.
	 *
	 * @return the user uuid of this entry
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this entry.
	 *
	 * @param userUuid the user uuid of this entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this entry.
	 *
	 * @return the user name of this entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this entry.
	 *
	 * @param userName the user name of this entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this entry.
	 *
	 * @return the create date of this entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this entry.
	 *
	 * @param createDate the create date of this entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this entry.
	 *
	 * @return the modified date of this entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this entry.
	 *
	 * @param modifiedDate the modified date of this entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this entry.
	 *
	 * @return the name of this entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this entry.
	 *
	 * @param name the name of this entry
	 */
	public void setName(String name);

	/**
	 * Returns the message of this entry.
	 *
	 * @return the message of this entry
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this entry.
	 *
	 * @param message the message of this entry
	 */
	public void setMessage(String message);

	/**
	 * Returns the email of this entry.
	 *
	 * @return the email of this entry
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this entry.
	 *
	 * @param email the email of this entry
	 */
	public void setEmail(String email);

	/**
	 * Returns the guestbook ID of this entry.
	 *
	 * @return the guestbook ID of this entry
	 */
	public long getGuestbookId();

	/**
	 * Sets the guestbook ID of this entry.
	 *
	 * @param guestbookId the guestbook ID of this entry
	 */
	public void setGuestbookId(long guestbookId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.doc.guestbook.model.Entry entry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.doc.guestbook.model.Entry> toCacheModel();

	@Override
	public com.liferay.doc.guestbook.model.Entry toEscapedModel();

	@Override
	public com.liferay.doc.guestbook.model.Entry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}