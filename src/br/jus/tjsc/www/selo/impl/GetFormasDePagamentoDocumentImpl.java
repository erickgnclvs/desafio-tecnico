/*
 * An XML document type.
 * Localname: getFormasDePagamento
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetFormasDePagamentoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getFormasDePagamento(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetFormasDePagamentoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetFormasDePagamentoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFormasDePagamentoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFORMASDEPAGAMENTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getFormasDePagamento");
    
    
    /**
     * Gets the "getFormasDePagamento" element
     */
    public br.jus.tjsc.www.selo.GetFormasDePagamento getGetFormasDePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetFormasDePagamento target = null;
            target = (br.jus.tjsc.www.selo.GetFormasDePagamento)get_store().find_element_user(GETFORMASDEPAGAMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFormasDePagamento" element
     */
    public void setGetFormasDePagamento(br.jus.tjsc.www.selo.GetFormasDePagamento getFormasDePagamento)
    {
        generatedSetterHelperImpl(getFormasDePagamento, GETFORMASDEPAGAMENTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getFormasDePagamento" element
     */
    public br.jus.tjsc.www.selo.GetFormasDePagamento addNewGetFormasDePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetFormasDePagamento target = null;
            target = (br.jus.tjsc.www.selo.GetFormasDePagamento)get_store().add_element_user(GETFORMASDEPAGAMENTO$0);
            return target;
        }
    }
}
