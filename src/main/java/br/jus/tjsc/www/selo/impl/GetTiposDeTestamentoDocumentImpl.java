/*
 * An XML document type.
 * Localname: getTiposDeTestamento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeTestamento(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeTestamentoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTestamentoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDETESTAMENTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTestamento");
    
    
    /**
     * Gets the "getTiposDeTestamento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTestamento getGetTiposDeTestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTestamento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTestamento)get_store().find_element_user(GETTIPOSDETESTAMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeTestamento" element
     */
    public void setGetTiposDeTestamento(br.jus.tjsc.www.selo.GetTiposDeTestamento getTiposDeTestamento)
    {
        generatedSetterHelperImpl(getTiposDeTestamento, GETTIPOSDETESTAMENTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeTestamento" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTestamento addNewGetTiposDeTestamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTestamento target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTestamento)get_store().add_element_user(GETTIPOSDETESTAMENTO$0);
            return target;
        }
    }
}
