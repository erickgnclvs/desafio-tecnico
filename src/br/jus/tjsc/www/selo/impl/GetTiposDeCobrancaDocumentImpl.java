/*
 * An XML document type.
 * Localname: getTiposDeCobranca
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeCobranca(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeCobrancaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobrancaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDECOBRANCA$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca");
    
    
    /**
     * Gets the "getTiposDeCobranca" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca getGetTiposDeCobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca)get_store().find_element_user(GETTIPOSDECOBRANCA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeCobranca" element
     */
    public void setGetTiposDeCobranca(br.jus.tjsc.www.selo.GetTiposDeCobranca getTiposDeCobranca)
    {
        generatedSetterHelperImpl(getTiposDeCobranca, GETTIPOSDECOBRANCA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeCobranca" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca addNewGetTiposDeCobranca()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca)get_store().add_element_user(GETTIPOSDECOBRANCA$0);
            return target;
        }
    }
}
