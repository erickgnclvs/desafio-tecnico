/*
 * An XML document type.
 * Localname: getTiposDeTelefone
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeTelefone(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeTelefoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTelefoneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDETELEFONE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTelefone");
    
    
    /**
     * Gets the "getTiposDeTelefone" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTelefone getGetTiposDeTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTelefone target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTelefone)get_store().find_element_user(GETTIPOSDETELEFONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeTelefone" element
     */
    public void setGetTiposDeTelefone(br.jus.tjsc.www.selo.GetTiposDeTelefone getTiposDeTelefone)
    {
        generatedSetterHelperImpl(getTiposDeTelefone, GETTIPOSDETELEFONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeTelefone" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTelefone addNewGetTiposDeTelefone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTelefone target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTelefone)get_store().add_element_user(GETTIPOSDETELEFONE$0);
            return target;
        }
    }
}
