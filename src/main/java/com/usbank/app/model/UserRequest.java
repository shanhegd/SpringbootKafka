/**
 * 
 */
package com.usbank.app.model;

import java.util.ArrayList;

/**
 * @author c084199
 *
 */
public class UserRequest {
	
		public String dataset;
	    public String datasetVersion;
	    public String usedBy;
	    public String path;
		public String getDataset() {
			return dataset;
		}
		public void setDataset(String dataset) {
			this.dataset = dataset;
		}
		public String getDatasetVersion() {
			return datasetVersion;
		}
		public void setDatasetVersion(String datasetVersion) {
			this.datasetVersion = datasetVersion;
		}
		public String getUsedBy() {
			return usedBy;
		}
		public void setUsedBy(String usedBy) {
			this.usedBy = usedBy;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public UserRequest(String dataset, String datasetVersion, String usedBy, String path) {
			super();
			this.dataset = dataset;
			this.datasetVersion = datasetVersion;
			this.usedBy = usedBy;
			this.path = path;
		}
	
		public UserRequest() {
			
		}
	
}
