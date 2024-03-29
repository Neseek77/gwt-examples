package org.gonevertical.democanvas.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BlobData implements IsSerializable  {

  private String blobKey;
  
  private String content_type;
  
  private Date creation;
  
  private String filename;
  
  private long size;
  
  private String path; 
  
  /**
   * init contructor - nothing to do here.
   */
  public BlobData() {
  }
  
  public void setKey(String blobKey) {
    this.blobKey = blobKey;
  }
  
  public String getKey() {
    return blobKey;
  }
  
  public void setContentType(String content_type) {
    this.content_type = content_type;
  }
  
  public String getContentType() {
    return content_type;
  }
  
  public void setCreation(Date creation) {
    this.creation = creation;
  }
  
  public Date getCreation() {
    return creation;
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  public String getFilename() {
    return filename;
  }
  
  public void setSize(long size) {
    this.size = size;
  }
  
  public long getSize() {
    return size;
  }
  
  public void setPath(String path) {
    this.path = path;
  }
  
  public String getPath() {
    return path;
  }
  
  public String toString() {
    String s = "";
    s += "blobKey=" + blobKey + " ";
    s += "content_type=" + content_type + " ";
    s += "creation=" + creation + " ";
    s += "filename=" + filename + " ";
    s += "size=" + size + " ";
    s += "path=" + path + " ";
    return s;
  }
}
