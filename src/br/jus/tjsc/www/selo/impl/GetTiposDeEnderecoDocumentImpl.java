/*
 * An XML document type.
 * Localname: getTiposDeEndereco
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEndereco(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEnderecoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEnderecoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEENDERECO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndereco");
    
    
    /**
     * Gets the "getTiposDeEndereco" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndereco getGetTiposDeEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndereco target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndereco)get_store().find_element_user(GETTIPOSDEENDERECO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEndereco" element
     */
    public void setGetTiposDeEndereco(br.jus.tjsc.www.selo.GetTiposDeEndereco getTiposDeEndereco)
    {
        generatedSetterHelperImpl(getTiposDeEndereco, GETTIPOSDEENDERECO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEndereco" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndereco addNewGetTiposDeEndereco()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndereco target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndereco)get_store().add_element_user(GETTIPOSDEENDERECO$0);
            return target;
        }
    }
}
