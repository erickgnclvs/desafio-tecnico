/*
 * An XML document type.
 * Localname: getJuizesDePazResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getJuizesDePazResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetJuizesDePazResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePazResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETJUIZESDEPAZRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePazResponse");
    
    
    /**
     * Gets the "getJuizesDePazResponse" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePazResponse getGetJuizesDePazResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePazResponse target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePazResponse)get_store().find_element_user(GETJUIZESDEPAZRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getJuizesDePazResponse" element
     */
    public void setGetJuizesDePazResponse(br.jus.tjsc.www.selo.GetJuizesDePazResponse getJuizesDePazResponse)
    {
        generatedSetterHelperImpl(getJuizesDePazResponse, GETJUIZESDEPAZRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getJuizesDePazResponse" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePazResponse addNewGetJuizesDePazResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePazResponse target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePazResponse)get_store().add_element_user(GETJUIZESDEPAZRESPONSE$0);
            return target;
        }
    }
}
