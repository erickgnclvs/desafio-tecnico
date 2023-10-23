/*
 * An XML document type.
 * Localname: getTiposDeServentuario
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeServentuario(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeServentuarioDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeServentuarioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESERVENTUARIO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeServentuario");
    
    
    /**
     * Gets the "getTiposDeServentuario" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeServentuario getGetTiposDeServentuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeServentuario target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeServentuario)get_store().find_element_user(GETTIPOSDESERVENTUARIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeServentuario" element
     */
    public void setGetTiposDeServentuario(br.jus.tjsc.www.selo.GetTiposDeServentuario getTiposDeServentuario)
    {
        generatedSetterHelperImpl(getTiposDeServentuario, GETTIPOSDESERVENTUARIO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeServentuario" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeServentuario addNewGetTiposDeServentuario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeServentuario target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeServentuario)get_store().add_element_user(GETTIPOSDESERVENTUARIO$0);
            return target;
        }
    }
}
