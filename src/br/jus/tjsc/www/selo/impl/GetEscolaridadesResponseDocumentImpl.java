/*
 * An XML document type.
 * Localname: getEscolaridadesResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEscolaridadesResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEscolaridadesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEscolaridadesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESCOLARIDADESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEscolaridadesResponse");
    
    
    /**
     * Gets the "getEscolaridadesResponse" element
     */
    public br.jus.tjsc.www.selo.GetEscolaridadesResponse getGetEscolaridadesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEscolaridadesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEscolaridadesResponse)get_store().find_element_user(GETESCOLARIDADESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEscolaridadesResponse" element
     */
    public void setGetEscolaridadesResponse(br.jus.tjsc.www.selo.GetEscolaridadesResponse getEscolaridadesResponse)
    {
        generatedSetterHelperImpl(getEscolaridadesResponse, GETESCOLARIDADESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEscolaridadesResponse" element
     */
    public br.jus.tjsc.www.selo.GetEscolaridadesResponse addNewGetEscolaridadesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEscolaridadesResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEscolaridadesResponse)get_store().add_element_user(GETESCOLARIDADESRESPONSE$0);
            return target;
        }
    }
}
