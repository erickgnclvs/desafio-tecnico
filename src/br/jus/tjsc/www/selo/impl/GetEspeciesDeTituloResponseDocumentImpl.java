/*
 * An XML document type.
 * Localname: getEspeciesDeTituloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEspeciesDeTituloResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEspeciesDeTituloResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEspeciesDeTituloResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESPECIESDETITULORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEspeciesDeTituloResponse");
    
    
    /**
     * Gets the "getEspeciesDeTituloResponse" element
     */
    public br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse getGetEspeciesDeTituloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse)get_store().find_element_user(GETESPECIESDETITULORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEspeciesDeTituloResponse" element
     */
    public void setGetEspeciesDeTituloResponse(br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse getEspeciesDeTituloResponse)
    {
        generatedSetterHelperImpl(getEspeciesDeTituloResponse, GETESPECIESDETITULORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEspeciesDeTituloResponse" element
     */
    public br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse addNewGetEspeciesDeTituloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponse)get_store().add_element_user(GETESPECIESDETITULORESPONSE$0);
            return target;
        }
    }
}
