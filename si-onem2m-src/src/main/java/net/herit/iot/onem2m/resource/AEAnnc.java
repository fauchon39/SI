//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:13:54 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="App-ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AE-ID" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList" minOccurs="0"/>
 *         &lt;element name="ontologyRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="requestReachability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentSerialization" type="{http://www.onem2m.org/xml/protocols}serializations" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}containerAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}group"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}groupAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicyAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}scheduleAnnc"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appName",
    "appID",
    "aeid",
    "pointOfAccess",
    "ontologyRef",
    "nodeLink",
    "requestReachability",
    "contentSerialization",
    "childResource",
    "containerOrContainerAnncOrGroup"
})
//@XmlRootElement(name = "AEAnnc")
@XmlRootElement(name = Naming.AEANNC_SN)
public class AEAnnc
    extends AnnouncedResource
{
	
//	public static final String SCHEMA_LOCATION = "CDT-AE-v1_2_0.xsd";
	public static final String SCHEMA_LOCATION = "CDT-AE-v1_6_0.xsd";
	
	public static final List<String> MA = new ArrayList<String>(
		Arrays.asList(Naming.RESOURCEID_SN,
						Naming.RESOURCENAME_SN,
						Naming.EXPIRATIONTIME_SN,
						Naming.ACCESSCONTROLPOLICYIDS_SN,
						Naming.LABELS_SN
		)
	);
	public static final Set<String> OA = new HashSet<String>(
		Arrays.asList(Naming.APPNAME_SN,
						Naming.APPID_SN,
						Naming.AEID_SN,
						Naming.POINTOFACCESS_SN,
						Naming.ONTOLOGYREF_SN,
						Naming.REQUESTREACHABILITY_SN,
						Naming.NODELINK_SN
		)
	);
	
	@XmlElement(name = Naming.APPNAME_SN)
	protected String appName;
	//@XmlElement(name = "App-ID", required = true)
	@XmlElement(name = Naming.APPID_SN)
	protected String appID;
	//@XmlElement(name = "AE-ID", required = true)
	@XmlElement(name = Naming.AEID_SN)
	protected String aeid;
	@XmlList
	@XmlElement(name = Naming.POINTOFACCESS_SN)
	protected List<String> pointOfAccess;
	@XmlSchemaType(name = "anyURI")
	@XmlElement(name = Naming.ONTOLOGYREF_SN)
	protected String ontologyRef;
	@XmlSchemaType(name = "anyURI")
	@XmlElement(name = Naming.NODELINK_SN)
	protected String nodeLink;
	@XmlElement(name = Naming.REQUESTREACHABILITY_SN)
	protected Boolean requestReachability;
	
	@XmlList
	@XmlElement(name = Naming.CONTENTSERIALIZATION_SN) //"csz")
	protected List<PermittedMediaTypes> contentSerialization;  // added in XSD-1.6.0
	
	@XmlElement(name = Naming.CHILDRESOURCE_SN)
	protected List<ChildResourceRef> childResource;
	@XmlElements({
		@XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
		@XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
		@XmlElement(name = "containerAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),
		@XmlElement(name = "accessControlPolicyAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),
		@XmlElement(name = "groupAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
		@XmlElement(name = "scheduleAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class),
		@XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
		@XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class)
	})
	protected List<Resource> containerOrContainerAnncOrGroup;

	
	public String toString() {
		StringBuilder sbld = new StringBuilder();
		
		sbld.append("[ AEAnnc ]").append(NL);
		sbld.append("appName:").append(appName).append(NL);
		sbld.append("appID:").append(appID).append(NL);
		sbld.append("aeid:").append(aeid).append(NL);
		sbld.append("pointOfAccess:").append(pointOfAccess).append(NL);
		sbld.append("ontologyRef:").append(ontologyRef).append(NL);
		sbld.append("nodeLink:").append(nodeLink).append(NL);
		sbld.append("requestReachability:").append(requestReachability).append(NL);
		sbld.append("childResource:").append(childResource).append(NL);
		sbld.append(super.toString());
		
		return sbld.toString();
	}
	
	/**
	 * Gets the value of the appName property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getAppName() {
		return appName;
	}

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the aeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAEID() {
        return aeid;
    }

    /**
     * Sets the value of the aeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAEID(String value) {
        this.aeid = value;
    }

    /**
     * Gets the value of the pointOfAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfAccess() {
//        if (pointOfAccess == null) {
//            pointOfAccess = new ArrayList<String>();
//        }
        return this.pointOfAccess;
    }

    public void addPointOfAccess(String poa) {
    	if (pointOfAccess == null) {
    		pointOfAccess = new ArrayList<String>();
    	}
    	this.pointOfAccess.add(poa);
    }
    
    /**
     * Gets the value of the ontologyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRef() {
        return ontologyRef;
    }

    /**
     * Sets the value of the ontologyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRef(String value) {
        this.ontologyRef = value;
    }

    /**
     * Gets the value of the nodeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLink() {
        return nodeLink;
    }

    /**
     * Sets the value of the nodeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLink(String value) {
        this.nodeLink = value;
    }

    /**
     * Gets the value of the requestReachability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestReachability() {
        return requestReachability;
    }

    /**
     * Sets the value of the requestReachability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestReachability(Boolean value) {
        this.requestReachability = value;
    }

    
    /**
     * XSD-1.6.0
     * Gets the value of the contentSerialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSerialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSerialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermittedMediaTypes }
     * 
     * 
     */
    public List<PermittedMediaTypes> getContentSerialization() {
//        if (contentSerialization == null) {
//            contentSerialization = new ArrayList<PermittedMediaTypes>();
//        }
        return this.contentSerialization;
    }
    
    public void addContentSerialization(PermittedMediaTypes pmt) {
    	 if (contentSerialization == null) {
             contentSerialization = new ArrayList<PermittedMediaTypes>();
         }
    	 contentSerialization.add(pmt);
    }
    
    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//        if (childResource == null) {
//            childResource = new ArrayList<ChildResourceRef>();
//        }
        return this.childResource;
    }

    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }
    
    /**
     * Gets the value of the containerOrContainerAnncOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerOrContainerAnncOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerOrContainerAnncOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * {@link Container }
     * {@link ContainerAnnc }
     * {@link AccessControlPolicyAnnc }
     * {@link GroupAnnc }
     * {@link ScheduleAnnc }
     * {@link Group }
     * {@link AccessControlPolicy }
     * 
     * 
     */
    public List<Resource> getContainerOrContainerAnncOrGroup() {
//        if (containerOrContainerAnncOrGroup == null) {
//            containerOrContainerAnncOrGroup = new ArrayList<Resource>();
//        }
        return this.containerOrContainerAnncOrGroup;
    }
    
    public void addContainerOrContainerAnncOrGroup(Resource res) {
    	if (containerOrContainerAnncOrGroup == null) {
    		containerOrContainerAnncOrGroup = new ArrayList<Resource>();
    	}
      this.containerOrContainerAnncOrGroup.add(res);
    }

}