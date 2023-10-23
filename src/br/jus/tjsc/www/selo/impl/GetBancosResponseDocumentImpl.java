/*
 * An XML document type.
 * Localname: getBancosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetBancosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getBancosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetBancosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetBancosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetBancosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBANCOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getBancosResponse");
    
    
    /**
     * Gets the "getBancosResponse" element
     */
    public br.jus.tjsc.www.selo.GetBancosResponse getGetBancosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetBancosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetBancosResponse)get_store().find_element_user(GETBANCOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBancosResponse" element
     */
    public void setGetBancosResponse(br.jus.tjsc.www.selo.GetBancosResponse getBancosResponse)
    {
        generatedSetterHelperImpl(getBancosResponse, GETBANCOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getBancosResponse" element
     */
    public br.jus.tjsc.www.selo.GetBancosResponse addNewGetBancosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetBancosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetBancosResponse)get_store().add_element_user(GETBANCOSRESPONSE$0);
            return target;
        }
    }
}
