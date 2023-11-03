/*
 * An XML document type.
 * Localname: getMotivosDeProtestoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMotivosDeProtestoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMotivosDeProtestoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeProtestoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOTIVOSDEPROTESTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeProtestoResponse");
    
    
    /**
     * Gets the "getMotivosDeProtestoResponse" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse getGetMotivosDeProtestoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse)get_store().find_element_user(GETMOTIVOSDEPROTESTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMotivosDeProtestoResponse" element
     */
    public void setGetMotivosDeProtestoResponse(br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse getMotivosDeProtestoResponse)
    {
        generatedSetterHelperImpl(getMotivosDeProtestoResponse, GETMOTIVOSDEPROTESTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMotivosDeProtestoResponse" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse addNewGetMotivosDeProtestoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeProtestoResponse)get_store().add_element_user(GETMOTIVOSDEPROTESTORESPONSE$0);
            return target;
        }
    }
}
