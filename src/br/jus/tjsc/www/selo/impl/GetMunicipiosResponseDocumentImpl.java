/*
 * An XML document type.
 * Localname: getMunicipiosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMunicipiosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMunicipiosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMunicipiosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMunicipiosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMunicipiosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMUNICIPIOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMunicipiosResponse");
    
    
    /**
     * Gets the "getMunicipiosResponse" element
     */
    public br.jus.tjsc.www.selo.GetMunicipiosResponse getGetMunicipiosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMunicipiosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMunicipiosResponse)get_store().find_element_user(GETMUNICIPIOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMunicipiosResponse" element
     */
    public void setGetMunicipiosResponse(br.jus.tjsc.www.selo.GetMunicipiosResponse getMunicipiosResponse)
    {
        generatedSetterHelperImpl(getMunicipiosResponse, GETMUNICIPIOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMunicipiosResponse" element
     */
    public br.jus.tjsc.www.selo.GetMunicipiosResponse addNewGetMunicipiosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMunicipiosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMunicipiosResponse)get_store().add_element_user(GETMUNICIPIOSRESPONSE$0);
            return target;
        }
    }
}
