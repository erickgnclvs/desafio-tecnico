/*
 * An XML document type.
 * Localname: putAtosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.PutAtosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one putAtosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class PutAtosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.PutAtosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PutAtosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUTATOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "putAtosResponse");
    
    
    /**
     * Gets the "putAtosResponse" element
     */
    public br.jus.tjsc.www.selo.PutAtosResponse getPutAtosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.PutAtosResponse target = null;
            target = (br.jus.tjsc.www.selo.PutAtosResponse)get_store().find_element_user(PUTATOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "putAtosResponse" element
     */
    public void setPutAtosResponse(br.jus.tjsc.www.selo.PutAtosResponse putAtosResponse)
    {
        generatedSetterHelperImpl(putAtosResponse, PUTATOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "putAtosResponse" element
     */
    public br.jus.tjsc.www.selo.PutAtosResponse addNewPutAtosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.PutAtosResponse target = null;
            target = (br.jus.tjsc.www.selo.PutAtosResponse)get_store().add_element_user(PUTATOSRESPONSE$0);
            return target;
        }
    }
}
