/*
 * An XML document type.
 * Localname: getTiposDeDocumento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeDocumento(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeDocumentoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeDocumentoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEDOCUMENTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeDocumento");
    
    
    /**
     * Gets the "getTiposDeDocumento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeDocumento getGetTiposDeDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeDocumento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeDocumento)get_store().find_element_user(GETTIPOSDEDOCUMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeDocumento" element
     */
    public void setGetTiposDeDocumento(br.jus.tjsc.www.selo.GetTiposDeDocumento getTiposDeDocumento)
    {
        generatedSetterHelperImpl(getTiposDeDocumento, GETTIPOSDEDOCUMENTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeDocumento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeDocumento addNewGetTiposDeDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeDocumento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeDocumento)get_store().add_element_user(GETTIPOSDEDOCUMENTO$0);
            return target;
        }
    }
}
