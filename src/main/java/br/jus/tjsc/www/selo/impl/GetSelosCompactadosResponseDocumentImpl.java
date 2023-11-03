/*
 * An XML document type.
 * Localname: getSelosCompactadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosCompactadosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosCompactadosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosCompactadosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSCOMPACTADOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosCompactadosResponse");
    
    
    /**
     * Gets the "getSelosCompactadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosCompactadosResponse getGetSelosCompactadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosCompactadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosCompactadosResponse)get_store().find_element_user(GETSELOSCOMPACTADOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosCompactadosResponse" element
     */
    public void setGetSelosCompactadosResponse(br.jus.tjsc.www.selo.GetSelosCompactadosResponse getSelosCompactadosResponse)
    {
        generatedSetterHelperImpl(getSelosCompactadosResponse, GETSELOSCOMPACTADOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosCompactadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosCompactadosResponse addNewGetSelosCompactadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosCompactadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosCompactadosResponse)get_store().add_element_user(GETSELOSCOMPACTADOSRESPONSE$0);
            return target;
        }
    }
}
