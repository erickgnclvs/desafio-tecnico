/*
 * An XML document type.
 * Localname: getTiposDeProcuracao
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeProcuracao(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeProcuracaoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeProcuracaoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEPROCURACAO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeProcuracao");
    
    
    /**
     * Gets the "getTiposDeProcuracao" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeProcuracao getGetTiposDeProcuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeProcuracao target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeProcuracao)get_store().find_element_user(GETTIPOSDEPROCURACAO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeProcuracao" element
     */
    public void setGetTiposDeProcuracao(br.jus.tjsc.www.selo.GetTiposDeProcuracao getTiposDeProcuracao)
    {
        generatedSetterHelperImpl(getTiposDeProcuracao, GETTIPOSDEPROCURACAO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeProcuracao" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeProcuracao addNewGetTiposDeProcuracao()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeProcuracao target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeProcuracao)get_store().add_element_user(GETTIPOSDEPROCURACAO$0);
            return target;
        }
    }
}
