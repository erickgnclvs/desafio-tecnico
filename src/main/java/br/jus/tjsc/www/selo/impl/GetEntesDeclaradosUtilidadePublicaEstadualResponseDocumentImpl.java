/*
 * An XML document type.
 * Localname: getEntesDeclaradosUtilidadePublicaEstadualResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEntesDeclaradosUtilidadePublicaEstadualResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEntesDeclaradosUtilidadePublicaEstadualResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEntesDeclaradosUtilidadePublicaEstadualResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTESDECLARADOSUTILIDADEPUBLICAESTADUALRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEntesDeclaradosUtilidadePublicaEstadualResponse");
    
    
    /**
     * Gets the "getEntesDeclaradosUtilidadePublicaEstadualResponse" element
     */
    public br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse getGetEntesDeclaradosUtilidadePublicaEstadualResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse)get_store().find_element_user(GETENTESDECLARADOSUTILIDADEPUBLICAESTADUALRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntesDeclaradosUtilidadePublicaEstadualResponse" element
     */
    public void setGetEntesDeclaradosUtilidadePublicaEstadualResponse(br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse getEntesDeclaradosUtilidadePublicaEstadualResponse)
    {
        generatedSetterHelperImpl(getEntesDeclaradosUtilidadePublicaEstadualResponse, GETENTESDECLARADOSUTILIDADEPUBLICAESTADUALRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEntesDeclaradosUtilidadePublicaEstadualResponse" element
     */
    public br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse addNewGetEntesDeclaradosUtilidadePublicaEstadualResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse)get_store().add_element_user(GETENTESDECLARADOSUTILIDADEPUBLICAESTADUALRESPONSE$0);
            return target;
        }
    }
}
