/*
 * An XML document type.
 * Localname: getTiposDeSubestabelecimento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeSubestabelecimento(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeSubestabelecimentoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSubestabelecimentoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESUBESTABELECIMENTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSubestabelecimento");
    
    
    /**
     * Gets the "getTiposDeSubestabelecimento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento getGetTiposDeSubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento)get_store().find_element_user(GETTIPOSDESUBESTABELECIMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeSubestabelecimento" element
     */
    public void setGetTiposDeSubestabelecimento(br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento getTiposDeSubestabelecimento)
    {
        generatedSetterHelperImpl(getTiposDeSubestabelecimento, GETTIPOSDESUBESTABELECIMENTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeSubestabelecimento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento addNewGetTiposDeSubestabelecimento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimento)get_store().add_element_user(GETTIPOSDESUBESTABELECIMENTO$0);
            return target;
        }
    }
}
